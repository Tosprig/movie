/*
SQLyog Ultimate v11.27 (32 bit)
MySQL - 5.6.30 : Database - movie
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`movie` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `movie`;

/*Table structure for table `animation` */

DROP TABLE IF EXISTS `animation`;

CREATE TABLE `animation` (
  `name` varchar(20) NOT NULL,
  `hrf` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `animation` */

insert  into `animation`(`name`,`hrf`) values ('monkey','http://v.qq.com/cover/3/3o56brnhunm5bwx.html?vid=x0018dcg7rm'),('totoro','http://www.iqiyi.com/w_19rrds6zx5.html');

/*Table structure for table `comedy` */

DROP TABLE IF EXISTS `comedy`;

CREATE TABLE `comedy` (
  `name` varchar(20) NOT NULL,
  `hrf` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comedy` */

insert  into `comedy`(`name`,`hrf`) values ('fool','http://www.iqiyi.com/dianying/20120618/f0faf21d5f12f65e.html?vfm=f_191_360y'),('jing','http://www.iqiyi.com/v_19rrnr18nc.html#vfrm=13-0-0-1');

/*Table structure for table `love` */

DROP TABLE IF EXISTS `love`;

CREATE TABLE `love` (
  `name` varchar(20) NOT NULL,
  `hrf` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `love` */

insert  into `love`(`name`,`hrf`) values ('girl','http://film.qq.com/cover/o/oxq0f0u4qwin0ms.html?ADTAG=INNER.TXV.COVER.REDIR'),('wolf','http://v.qq.com/cover/e/ej12b9j58gxzc45.html');

/*Table structure for table `mystery` */

DROP TABLE IF EXISTS `mystery`;

CREATE TABLE `mystery` (
  `name` varchar(20) NOT NULL,
  `hrf` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `mystery` */

insert  into `mystery`(`name`,`hrf`) values ('boat','http://www.iqiyi.com/v_19rrhk5qoc.html?vfm=f_191_360y'),('kill','http://www.le.com/ptv/vplay/1200371.html?ch=sougou_mfdy');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phonenum` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`name`,`password`,`email`,`phonenum`) values ('张三','1','1432831602@qq.com','17090026659'),('李四','2','123456@qq.com','12345688'),('王五','3','123456@qq.com','1213'),('雯柳','4','123456@qq.com','17090026659');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
