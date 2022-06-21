/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.20 : Database - user-system
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`user-system` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `user-system`;

/*Table structure for table `usermanager` */

DROP TABLE IF EXISTS `usermanager`;

CREATE TABLE `usermanager` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(20) NOT NULL,
  `sex` varchar(6) NOT NULL,
  `age` int(20) NOT NULL,
  `address` varchar(30) NOT NULL,
  `qq` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `usermanager` */

insert  into `usermanager`(`id`,`name`,`sex`,`age`,`address`,`qq`,`email`) values (1,'张三','男',25,'云南','123456','123456@qq.com'),(2,'李四','男',21,'北京','4567','4567@qq.com'),(3,'景甜','女',23,'河南','0987','0987@qq.com'),(4,'小明','男',20,'四川','78954','78954@qq.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
