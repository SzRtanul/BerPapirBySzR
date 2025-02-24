CREATE TABLE `MunkaViszony` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `elnevezes` varchar(32)
);

CREATE TABLE `JogViszony` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `elnevezes` varchar(32) UNIQUE
);

CREATE TABLE `Szemely` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `szemelyiSzam` char(6) UNIQUE,
  `nev` char(30) UNIQUE,
  `viszonyID` int,
  `megszuntViszony` bit,
  `email` varchar(32)
);

CREATE TABLE `JogViszonyban` (
  `szemelyID` int,
  `viszonyID` int,
  PRIMARY KEY (`szemelyID`, `viszonyID`)
);

ALTER TABLE `Szemely` ADD FOREIGN KEY (`viszonyID`) REFERENCES `MunkaViszony` (`id`);

ALTER TABLE `JogViszonyban` ADD FOREIGN KEY (`viszonyID`) REFERENCES `JogViszony` (`id`);

ALTER TABLE `JogViszonyban` ADD FOREIGN KEY (`szemelyID`) REFERENCES `Szemely` (`id`);
