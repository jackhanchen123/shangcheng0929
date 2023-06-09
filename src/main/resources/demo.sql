set names gbk;
-- 建议使用utf-8

drop
database if exists card;
create
database if not exists card;
use
card;

/**院系**/
drop table if exists college;
create table if not exists college
(
    college_id
    int
    not
    null
    primary
    key
    auto_increment,
    college_name
    varchar
(
    20
) not null
    ) default CHARSET=utf8;
insert into college(college_name)
values ('软件工程系');
insert into college(college_name)
values ('网络工程系');
insert into college(college_name)
values ('数学系');


/**学生**/
drop table if exists student;
create table if not exists student
(
    stu_id
    int
    not
    null
    primary
    key
    auto_increment,
    stu_no
    char
(
    12
) not null,
    stu_name varchar
(
    16
) not null,
    stu_login varchar
(
    16
) not null unique,
    stu_passwd char
(
    32
) not null,
    stu_phone char
(
    11
),
    stu_limit int default 1,
    stu_remain int,
    stu_note varchar
(
    100
),
    college_id int
    ) default CHARSET=utf8;
insert into student(stu_no, stu_name, stu_login, stu_passwd, stu_phone, stu_remain, stu_note, college_id)
values ('STU201806001', '张三', 'tom', '8C7E1F3B1B787EC9F24FCC01E243E072', '13812282811', 666, '1班学生', 1);
insert into student(stu_no, stu_name, stu_login, stu_passwd, stu_phone, stu_remain, stu_note, college_id)
values ('STU201806002', '李四', 'mike', '8C7E1F3B1B787EC9F24FCC01E243E072', '13812282812', 66, '1班学生', 1);
insert into student(stu_no, stu_name, stu_login, stu_passwd, stu_phone, stu_remain, stu_note, college_id)
values ('STU201806003', '张三1', 'jack', '8C7E1F3B1B787EC9F24FCC01E243E072', '13812282813', 606, '2班学生', 2);
insert into student(stu_no, stu_name, stu_login, stu_passwd, stu_phone, stu_remain, stu_note, college_id)
values ('STU201806004', '陈六', 'tim', '8C7E1F3B1B787EC9F24FCC01E243E072', '13812282814', 600, '3班学生', 3);

select *
from student
where stu_name REGEXP '^张三[1-9]{0,1}$';
select count(stu_id)
from student
where stu_name REGEXP '^张三[1-9]{0,2}$';

/**费用类型-充值/消费**/
drop table if exists detailtype;
create table if not exists detailtype
(
    type_id
    int
    not
    null
    primary
    key
    auto_increment,
    type_name
    varchar
(
    20
) not null
    ) default CHARSET=UTF8;
insert into detailtype(type_name)
values ('充值');
insert into detailtype(type_name)
values ('消费');

/**费用**/
drop table if exists detail;
create table if not exists detail
(
    detail_id
    int
    not
    null
    primary
    key
    auto_increment,
    detail_stuserial
    char
(
    36
) unique not null,
    detail_time datetime,
    detail_money int,
    detail_title varchar
(
    60
),
    stu_id int,
    type_id int
    ) default CHARSET=UTF8;

insert into detail(detail_stuserial, detail_time, detail_money, detail_title, stu_id, type_id)
values ('ea986ed0-f523-4bca-bedb-9b4357253e20', now(), 10, '饮食', 1, 2);
insert into detail(detail_stuserial, detail_time, detail_money, detail_title, stu_id, type_id)
values ('8598cdd0-611d-48f7-b338-64defbb60011', now(), 20, '娱乐', 1, 2);

/**用户**/
drop table if exists userinfo;
create table if not exists userinfo
(
    user_id int
(
    11
) NOT NULL AUTO_INCREMENT primary key,
    user_name varchar
(
    30
),
    user_login varchar
(
    30
),
    user_passwd char
(
    32
) DEFAULT 'E10ADC3949BA59ABBE56E057F20F883E'
    ) ENGINE=InnoDB AUTO_INCREMENT=132 DEFAULT CHARSET=utf8;

insert into userinfo(user_name, user_login, user_passwd)
values ('张三', 'zhangsan', '8C7E1F3B1B787EC9F24FCC01E243E072');

/**商品表**/
drop table if exists goods;
create table if not exists goods
(
    goods_id int
(
    11
) NOT NULL AUTO_INCREMENT primary key,
    goods_name varchar
(
    30
),
    goods_price DOUBLE,
    goods_number int ,
    goods_typeid int ,
    goods_img VARCHAR
(
    400
) NOT NULL
    ) ENGINE=InnoDB AUTO_INCREMENT=132 DEFAULT CHARSET=utf8;

insert into goods(goods_name, goods_price, goods_number, goods_typeid, goods_img)
values ('华为', 8888, 100, 1, 'http://localhost:9000/goods/5e36a0ef5b1845a6b42ea0a62f95d9ce.jpg');
insert into goods(goods_name, goods_price, goods_number, goods_typeid, goods_img)
values ('华为', 8888, 100, 1, 'http://localhost:9000/goods/992f2ce303bc474bb6108c7588806fe3.jpg');
insert into goods(goods_name, goods_price, goods_number, goods_typeid, goods_img)
values ('华为', 8888, 100, 1, 'http://localhost:9000/goods/f349fda474d14d95b9d940fea92876ba.jpg');
insert into goods(goods_name, goods_price, goods_number, goods_typeid, goods_img)
values ('华为', 8888, 100, 1, 'http://localhost:9000/goods/1718fb14602e42ec8f36d2ee48b7872d.jpg');

/**用户购物表**/
drop table if exists buygoods;
create table if not exists buygoods
(
    buygoods_id int
(
    11
) NOT NULL AUTO_INCREMENT primary key,
    buygoods_stuid int,
    buygoods_buynumber int default 1
    ) ENGINE=InnoDB AUTO_INCREMENT=132 DEFAULT CHARSET=utf8;



