CREATE DATABASE carRegistry;
CREATE TABLE vehicle (vin VARCHAR () NOT NULL, make VARCHAR (), model VARCHAR (), yearMade YEAR,
                       plate VARCHAR (), numberOfTires Integer ,PRIMARY KEY (vin), UNIQUE KEY (plate));