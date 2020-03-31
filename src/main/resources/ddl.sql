# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 35.220.222.101 (MySQL 5.5.5-10.2.14-MariaDB-log)
# Database: cmb0
# Generation Time: 2019-10-10 10:00:13 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table order_0
# ------------------------------------------------------------

DROP TABLE IF EXISTS `order_0`;

CREATE TABLE `order_0` (
  `id` int(11) NOT NULL,
  `mid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table order_1
# ------------------------------------------------------------

DROP TABLE IF EXISTS `order_1`;

CREATE TABLE `order_1` (
  `id` int(11) NOT NULL,
  `mid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table order_2
# ------------------------------------------------------------

DROP TABLE IF EXISTS `order_2`;

CREATE TABLE `order_2` (
  `id` int(11) NOT NULL,
  `mid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table order_m1001
# ------------------------------------------------------------

DROP TABLE IF EXISTS `order_m1001`;

CREATE TABLE `order_m1001` (
  `id` int(11) NOT NULL,
  `mid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table order_m1002
# ------------------------------------------------------------

DROP TABLE IF EXISTS `order_m1002`;

CREATE TABLE `order_m1002` (
  `id` int(11) NOT NULL,
  `mid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table order_m1003
# ------------------------------------------------------------

DROP TABLE IF EXISTS `order_m1003`;

CREATE TABLE `order_m1003` (
  `id` int(11) NOT NULL,
  `mid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
