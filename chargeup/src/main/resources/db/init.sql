-- 账目
drop table if exists account;
create table account(
        id int not null auto_increment primary key, 
        amount decimal(20,6) default 0, 
        coin_type int not null default 1,  
        user_id int not null,      
        insert_time datetime default current_timestamp,
        update_time datetime,   
        remarks varchar(255),  
        description varchar(255),
        isvalid  boolean default true,
        belong_folder_id int,
        type_id int
);
        
-- 类别
drop table if exists type;
create table type(
        id int auto_increment primary key,
        type_name varchar(255) not null,
        desc_eng varchar(255),
        desc_chn varchar(255)
);

-- 币种
drop table if exists cointype;
create table cointype(
        id int auto_increment primary key,
        coin_name varchar(255) not null,
        desc_eng varchar(255),
        desc_chn varchar(255)
);

-- 用户表
drop table if exists users;
create table users(
        id int auto_increment primary key,
        username varchar(255) not null,
        password varchar(65) not null,
        displayname varchar(255) not null,
        desc4user varchar(255),
        insert_time datetime not null default current_timestamp,
        is_login boolean default false,
        isvalid boolean default true
);

-- 账本
drop table if exists booksfolder;
create table booksfolder(
        id int auto_increment primary key,
        foldername varchar(255) not null,
        desc4folder varchar(255),
        encrypt boolean default false,
        user_id int not null,
        usergroup_id int not null,
        password varchar(65),
        insert_time datetime not null default current_timestamp
);