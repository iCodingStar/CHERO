DROP DATABASE IF EXISTS c_hero;

CREATE SCHEMA c_hero;

USE c_hero;

DROP TABLE IF EXISTS c_hero.admin;
DROP TABLE IF EXISTS c_hero.member;
DROP TABLE IF EXISTS c_hero.trainer;
DROP TABLE IF EXISTS c_hero.course_category;
DROP TABLE IF EXISTS c_hero.course;
DROP TABLE IF EXISTS c_hero.course_stage;
DROP TABLE IF EXISTS `c_hero`.`order`;
DROP TABLE IF EXISTS c_hero.member_schedule;
DROP TABLE IF EXISTS c_hero.unique_key;

/**
 * @author iCodingStar
 * @date 2016/6/10 19:30
 * @version 1.0
 */
CREATE TABLE `c_hero`.`admin`(
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `admin_id` VARCHAR(12) NOT NULL UNIQUE COMMENT '管理员账号',
  `admin_name` VARCHAR(45) NOT NULL COMMENT '姓名',
  `admin_nickname` VARCHAR(45) NOT NULL DEFAULT '' COMMENT '昵称',
  `password` VARCHAR(45) NOT NULL COMMENT '密码',
  `password_salt` VARCHAR(45) NOT NULL COMMENT '加密密码',
  `enable` TINYINT(1) NOT NULL DEFAULT 1 COMMENT '权限',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='后台管理用户表';


/**
 * @author iCodingStar
 * @date 2016/6/10 19:30
 * @version 1.0
 */
CREATE TABLE `c_hero`.`member`(
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `member_id` VARCHAR(12) NOT NULL UNIQUE COMMENT '会员账号',
  `member_nickname` VARCHAR(45) NOT NULL DEFAULT '小鲜肉' COMMENT '昵称',
  `member_name` VARCHAR(45) NOT NULL COMMENT '姓名',
  `password` VARCHAR(45) NOT NULL COMMENT '密码',
  `password_salt` VARCHAR(45) NOT NULL COMMENT '加密密码',
  `enable` TINYINT(1) NOT NULL DEFAULT 1 COMMENT '权限',
  `member_image`  VARCHAR(128) DEFAULT 'member.jpg' COMMENT '会员照片',
  `member_sex`  VARCHAR(1) COMMENT '会员性别',
  `member_birthday` DATE COMMENT '会员出生日期',
  `member_hobby` VARCHAR(128) COMMENT '会员兴趣爱好',
  `member_telephone` VARCHAR(11) COMMENT '会员电话',
  `member_home_phone` VARCHAR(11)  COMMENT '会员家庭电话',
  `member_qq` VARCHAR(24) COMMENT '会员qq',
  `member_weixin` VARCHAR(24) COMMENT '会员微信',
  `member_address` VARCHAR(128) COMMENT '会员家庭住址',
  `member_note` VARCHAR(128) COMMENT '会员备注',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='会员用户表';

/**
 * @author iCodingStar
 * @date 2016/6/10 19:30
 * @version 1.0
 */
CREATE TABLE `c_hero`.`trainer`(
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `trainer_id` VARCHAR(12) NOT NULL UNIQUE COMMENT '教练账号',
  `trainer_nickname` VARCHAR(45) NOT NULL DEFAULT '老鸟' COMMENT '昵称',
  `trainer_name` VARCHAR(45) NOT NULL COMMENT '姓名',
  `trainer_image` VARCHAR(128) DEFAULT 'trainer.jpg' COMMENT '教练照片',
  `trainer_info` VARCHAR(256) DEFAULT '' COMMENT '教练简介',
  `trainer_sex`  VARCHAR(1) COMMENT '' COMMENT '教练性别',
  `trainer_birthday` DATE COMMENT '教练出生日期',
  `trainer_telephone` VARCHAR(11) COMMENT '教练电话',
  `trainer_home_phone` VARCHAR(11)  COMMENT '教练家庭电话',
  `trainer_qq` VARCHAR(24) COMMENT '教练qq',
  `trainer_weixin` VARCHAR(24) COMMENT '教练微信',
  `trainer_address` VARCHAR(128) COMMENT '教练家庭住址',
  `trainer_note` VARCHAR(128) COMMENT '教练备注',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='教练用户表';


/**
 * @author iCodingStar
 * @date 2016/6/10 19:30
 * @version 1.0
 */
CREATE TABLE `c_hero`.`course_category`(
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `course_category_id` VARCHAR(12) NOT NULL UNIQUE COMMENT '课程分类ID',
  `course_category_name` VARCHAR(8) NOT NULL UNIQUE COMMENT '课程分类名称',
  `course_category_description` VARCHAR(128) NOT NULL UNIQUE COMMENT '课程类别描述',
  `course_category_image`  VARCHAR(128) DEFAULT 'course_category.jpg' COMMENT '课程类别照片',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='课程类别表';


/**
 * @author iCodingStar
 * @date 2016/6/10 19:30
 * @version 1.0
 */
CREATE TABLE `c_hero`.`course`(
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `course_id` VARCHAR(12) NOT NULL UNIQUE COMMENT '课程ID',
  `course_name` VARCHAR(8) NOT NULL UNIQUE COMMENT '课程名称',
  `course_image` VARCHAR(128) DEFAULT 'course.jpg' COMMENT '课程照片',
  `course_category_id` VARCHAR(12) NOT NULL UNIQUE COMMENT '课程分类ID',
  `hot` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '热门课程[0:"普通课程",1:"热门课程"]',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='课程信息表';

/**
 * @author iCodingStar
 * @date 2016/6/10 19:30
 * @version 1.0
 */
CREATE TABLE `c_hero`.`course_stage`(
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `stage_id` VARCHAR(12) NOT NULL UNIQUE COMMENT '课程期次ID',
  `stage_times` INT NOT NULL COMMENT '课程节数',
  `stage_capacity` INT COMMENT '课程容量',
  `stage_left_capacity` INT COMMENT '剩余容量',
  `course_id` VARCHAR(12) NOT NULL UNIQUE COMMENT '课程ID',
  `stage_name`  VARCHAR(8) NOT NULL UNIQUE COMMENT '课程期次名称',
  `start_time` DATE COMMENT '开课时间',
  `end_time` DATE COMMENT '结课时间',
  `course_stage_price` DOUBLE DEFAULT 0.0 COMMENT '期次课程价格',
  `stage_schedule_image` VARCHAR(128) COMMENT '课程安排的图片',
  `stage_poster_image` VARCHAR(128) COMMENT '课程海报',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='课程期次表';

/**
 * @author iCodingStar
 * @date 2016/6/10 19:31
 * @version 1.0
 */
CREATE TABLE `c_hero`.`order`(
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `order_id` VARCHAR(12) NOT NULL UNIQUE COMMENT '订单ID',
  `member_id`VARCHAR(12) NOT NULL UNIQUE COMMENT '会员ID',
  `course_id` VARCHAR(12) NOT NULL UNIQUE COMMENT '课程ID',
  `stage_id`VARCHAR(12) NOT NULL UNIQUE COMMENT '期次ID',
  `order_state` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '订单状态[0:"提交订单",1:"交易成功"]',
  `order_comment` VARCHAR(128) COMMENT '课程评价',
  `order_reply_comment` VARCHAR(128) COMMENT '对学生的评价',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='会员订单表';

/**
 * @author iCodingStar
 * @date 2016/6/10 19:31
 * @version 1.0
 */
CREATE TABLE `c_hero`.`member_schedule`(
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `member_id`VARCHAR(12) NOT NULL UNIQUE COMMENT '会员ID',
  `course_id` VARCHAR(12) NOT NULL UNIQUE COMMENT '课程ID',
  `stage_id`VARCHAR(12) NOT NULL UNIQUE COMMENT '期次ID',
  `left_times` INT COMMENT '剩余课程次数',
   PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='会员课程表';

ALTER TABLE c_hero.member ADD member_email VARCHAR(24) NULL;

/**
 * @author iCodingStar
 * @date 2016/7/31 19:31
 * @version 1.0
 */
CREATE TABLE `c_hero`.`unique_key`(
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `member_id` VARCHAR(12) UNIQUE COMMENT '用户id',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='唯一键生成表';