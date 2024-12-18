-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema refugio_seguro
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema refugio_seguro
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `refugio_seguro` DEFAULT CHARACTER SET utf8 ;
USE `refugio_seguro` ;

-- -----------------------------------------------------
-- Table `refugio_seguro`.`LOCATION`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `refugio_seguro`.`LOCATION` (
  `ID` BIGINT(63) NOT NULL AUTO_INCREMENT,
  `LATITUD` DECIMAL(8,6) NOT NULL,
  `LONGITUD` DECIMAL(9,6) NOT NULL,
  `POSTAL_CODE` VARCHAR(45) NOT NULL,
  `CITY` VARCHAR(255) NOT NULL,
  `STREET_NAME` VARCHAR(255) NOT NULL,
  `FLAT` INT NULL,
  `DOOR` VARCHAR(45) NULL,
  `OTHER` VARCHAR(3000) NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `refugio_seguro`.`FOOD`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `refugio_seguro`.`FOOD` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `FRUIT_QTY` INT NULL,
  `FRUID_UNIT` VARCHAR(45) NULL,
  `MEAT_QTY` INT NULL,
  `MEAT_UNIT` VARCHAR(45) NULL,
  `VEGETABLES_QTY` INT NULL,
  `VEGETABLES_UNIT` VARCHAR(45) NULL,
  `FISH_QTY` INT NULL,
  `FISH_UNIT` VARCHAR(45) NULL,
  `RICE_QTY` INT NULL,
  `RICE_UNIT` VARCHAR(45) NULL,
  `PASTA_QTY` INT NULL,
  `PASTA_UNIT` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `refugio_seguro`.`CLEANING_UTILITIES`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `refugio_seguro`.`CLEANING_UTILITIES` (
  `ID` BIGINT(63) NOT NULL,
  `WASHING_MACHING_DETERGENT` INT NULL,
  `DISHWASHER_MACHINE_DETERGENT` INT NULL,
  `DISHWASHER_SOAP` INT NULL,
  `BLEACH` INT NULL,
  `AMMONIA` INT NULL,
  `INSECTICIDE` INT NULL,
  `WC_CLEANING_SOAP` INT NULL,
  `TOILET_CLEANING_SOAP` INT NULL,
  `OTHER` VARCHAR(4000) NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `refugio_seguro`.`TOILETRIES`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `refugio_seguro`.`TOILETRIES` (
  `ID` BIGINT(63) NOT NULL,
  `WC_PAPER` INT NULL,
  `TISSUES` INT NULL,
  `PADS` INT NULL,
  `TAMPONS` INT NULL,
  `SHOWER_GEL` INT NULL,
  `HAND_SOAP` INT NULL,
  `SHAMPOO` INT NULL,
  `SHAVING_SOAP` INT NULL,
  `RAZORS` INT NULL,
  `BABY_DIAPERS` INT NULL,
  `ADULT_DIAPERS` INT NULL,
  `OTHER` VARCHAR(4000) NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `refugio_seguro`.`SHELTER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `refugio_seguro`.`SHELTER` (
  `ID` BIGINT(63) NOT NULL,
  `NAME` VARCHAR(255) NOT NULL,
  `MAX_CAPACITY` INT NOT NULL,
  `CURRENT_AVAILABILITY` INT NOT NULL,
  `ROOMS_QTY` INT NOT NULL,
  `BATHS_QTY` INT NOT NULL,
  `WASHING_MACHINES_QTY` INT NOT NULL,
  `LOCATION_ID` BIGINT(63) NOT NULL,
  `FOOD_ID` INT NOT NULL,
  `CLEANING_UTILITIES_ID` BIGINT(63) NOT NULL,
  `TOILETRIES_ID` BIGINT(63) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC) VISIBLE,
  INDEX `fk_SHELTER_LOCATION1_idx` (`LOCATION_ID` ASC) VISIBLE,
  INDEX `fk_SHELTER_FOOD1_idx` (`FOOD_ID` ASC) VISIBLE,
  INDEX `fk_SHELTER_CLEANING_UTILITIES1_idx` (`CLEANING_UTILITIES_ID` ASC) VISIBLE,
  INDEX `fk_SHELTER_TOILETRIES1_idx` (`TOILETRIES_ID` ASC) VISIBLE,
  CONSTRAINT `fk_SHELTER_LOCATION1`
    FOREIGN KEY (`LOCATION_ID`)
    REFERENCES `refugio_seguro`.`LOCATION` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_SHELTER_FOOD1`
    FOREIGN KEY (`FOOD_ID`)
    REFERENCES `refugio_seguro`.`FOOD` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_SHELTER_CLEANING_UTILITIES1`
    FOREIGN KEY (`CLEANING_UTILITIES_ID`)
    REFERENCES `refugio_seguro`.`CLEANING_UTILITIES` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_SHELTER_TOILETRIES1`
    FOREIGN KEY (`TOILETRIES_ID`)
    REFERENCES `refugio_seguro`.`TOILETRIES` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `refugio_seguro`.`USER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `refugio_seguro`.`USER` (
  `ID` BIGINT(63) NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(255) NOT NULL,
  `EMAIL` VARCHAR(255) NOT NULL,
  `PASSWORD` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `refugio_seguro`.`SHELTER_UPDATES`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `refugio_seguro`.`SHELTER_UPDATES` (
  `ID` BIGINT(63) NOT NULL AUTO_INCREMENT,
  `shelter_from` VARCHAR(4000) NULL,
  `shelter_to` VARCHAR(4000) NULL,
  `USER_ID` BIGINT(63) NOT NULL,
  `SHELTER_ID` BIGINT(63) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC) VISIBLE,
  INDEX `fk_SHELTER_UPDATES_USER1_idx` (`USER_ID` ASC) VISIBLE,
  INDEX `fk_SHELTER_UPDATES_SHELTER1_idx` (`SHELTER_ID` ASC) VISIBLE,
  CONSTRAINT `fk_SHELTER_UPDATES_USER1`
    FOREIGN KEY (`USER_ID`)
    REFERENCES `refugio_seguro`.`USER` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_SHELTER_UPDATES_SHELTER1`
    FOREIGN KEY (`SHELTER_ID`)
    REFERENCES `refugio_seguro`.`SHELTER` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `refugio_seguro`.`SESSION`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `refugio_seguro`.`SESSION` (
  `ID` BIGINT(63) NOT NULL AUTO_INCREMENT,
  `TOKEN` VARCHAR(255) NOT NULL,
  `VALID_UNTIL` DATETIME NOT NULL,
  `USER_ID` BIGINT(63) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC) VISIBLE,
  INDEX `fk_SESSION_USER_idx` (`USER_ID` ASC) VISIBLE,
  CONSTRAINT `fk_SESSION_USER`
    FOREIGN KEY (`USER_ID`)
    REFERENCES `refugio_seguro`.`USER` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
