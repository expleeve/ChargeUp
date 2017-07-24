CREATE DATABASE IF NOT EXISTS `chargeupdb` 
DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;
  
USE DATABASE `chargeupdb`;

-- 账目
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` decimal(20,6) DEFAULT '0.000000',
  `coin_type` int(11) NOT NULL DEFAULT '1',
  `user_id` int(11) NOT NULL,
  `insert_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT NULL,
  `remarks` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `isvalid` tinyint(1) DEFAULT '1',
  `belong_folder_id` int(11) DEFAULT NULL,
  `type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
        
-- 类别
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(255) CHARACTER SET utf8 NOT NULL,
  `desc_eng` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `desc_chn` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 币种
DROP TABLE IF EXISTS `cointype`;
CREATE TABLE `cointype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `coin_name` varchar(255) CHARACTER SET utf8 NOT NULL,
  `desc_eng` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `desc_chn` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `cointype`(`id`, `coin_name`, `desc_eng`, `desc_chn`)
VALUES (1, 'CNY', 'CNY', '人民币');

-- 用户表
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 NOT NULL,
  `password` varchar(65) CHARACTER SET utf8 NOT NULL,
  `displayname` varchar(255) CHARACTER SET utf8 NOT NULL,
  `desc4user` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `insert_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `is_login` tinyint(1) DEFAULT '0',
  `isvalid` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 账本
DROP TABLE IF EXISTS `booksfolder`;
CREATE TABLE `booksfolder` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `foldername` varchar(255) CHARACTER SET utf8 NOT NULL,
  `desc4folder` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `encrypt` tinyint(1) DEFAULT '0',
  `user_id` int(11) NOT NULL,
  `usergroup_id` int(11) NOT NULL,
  `password` varchar(65) CHARACTER SET utf8 DEFAULT NULL,
  `insert_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;