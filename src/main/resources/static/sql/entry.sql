CREATE TABLE `entry` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`time` DATE NULL DEFAULT NULL,
	`temperature` FLOAT NULL DEFAULT NULL,
	`humidity` FLOAT NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
