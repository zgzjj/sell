--商品表
CREATE TABLE `product_info`(
	`product_id` VARCHAR(32) NOT NULL,
	`product_name` VARCHAR(64) NOT NULL COMMENT '商品名称',
	`product_price` DECIMAL(8,2) NOT NULL COMMENT '单价',
	`product_stock` int NOT NULL COMMENT '库存',
	`product_description` VARCHAR(64) NOT NULL COMMENT '描述',
	`product_icon` VARCHAR(512) COMMENT '小图',
	`category_type` int NOT NULL COMMENT '类目编号',
	`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
	PRIMARY KEY (`product_id`)
) COMMENT '商品表'

--类目表
CREATE TABLE `product_category`(
	`category_id` INT NOT NULL AUTO_INCREMENT,
	`category_name` VARCHAR(64) NOT NULL COMMENT '类目名称',
	`category_type` int NOT NULL COMMENT '类目编号',
	`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
	PRIMARY KEY (`category_id`),
	UNIQUE KEY `uqe_category_type` (`category_type`)
) COMMENT '类目表'

--订单表
CREATE TABLE `order_master`(
	`order_id` VARCHAR(32) NOT NULL,
	`buyer_name` VARCHAR(32) NOT NULL COMMENT '买家名称',
	`buyer_phone` VARCHAR(32) NOT NULL COMMENT '买家电话',
	`buyer_address` VARCHAR(128) NOT NULL COMMENT '买家地址',
	`buyer_openid` VARCHAR(64) NOT NULL COMMENT '买家微信openid',
	`order_amount` DECIMAL(8,2) NOT NULL COMMENT '订单总金额',
	`order_status` TINYINT(3) NOT NULL DEFAULT '0' COMMENT '订单状态，默认0新下单',
	`pay_status` TINYINT(3) NOT NULL DEFAULT '0' COMMENT '支付状态，默认0未支付',
	`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
	PRIMARY KEY (`order_id`),
	KEY `idx_buyer_openid` (`buyer_openid`)
) COMMENT '订单表'

--订单详情表
CREATE TABLE `order_detail`(
	`detail_id` VARCHAR(32) NOT NULL,
	`order_id` VARCHAR(32) NOT NULL,
	`peoduct_id` VARCHAR(32) NOT NULL,
	`product_name` VARCHAR(64) NOT NULL COMMENT '商品名称',
	`product_price` DECIMAL(8,2) NOT NULL COMMENT '单价',
	`product_quantity` int NOT NULL COMMENT '商品数量',
	`product_icon` VARCHAR(512) COMMENT '小图',
	`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
	PRIMARY KEY (`detail_id`),
	KEY `idx_order_openid` (`order_id`)
) COMMENT '订单详情表'