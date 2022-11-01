drop database if exists db_warehouse;
create database if not exists  db_warehouse default charset utf8mb4 ;
use db_warehouse;


create table tb_sample(
                          id int auto_increment comment 'id',
                          no int comment 'No.',
                          sample_id varchar(30) not null comment 'sample id',
                          survey_ship varchar(10) not null comment 'survey ship',
                          voyage_number varchar(20) not null comment 'voyage number',
                          end_depth double(7,4) unsigned not null comment 'end depth',
    driller_length double(7,4) unsigned not null comment 'driller length',
    storage_location varchar(10) not null comment 'storage location',
    storage_condition double(3,2) null comment 'storage condition',
    remark text null comment 'remark',
    primary key (id)

) comment 'collected sample info table';

create table tb_sample_detail_location(
                                          id int auto_increment comment 'id',
                                          sample_id varchar(30) not null comment 'sample id',
                                          sea_area varchar(10) not null comment  'sea areas',
                                          location_area varchar(5) not null comment 'location areas',
                                          coordinate_x double(7,4)  not null  comment 'coordinate x',
  coordinate_y double(7,4)  not null  comment 'coordinate y',
  detail_address varchar(30) null comment 'detail address of samples',
  primary key (id)

)  comment 'sample detail location';