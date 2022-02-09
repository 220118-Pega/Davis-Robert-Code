
create type  refundType as enum ('LODGING', 'TRAVEL', 'FINANCE', 'FOOD', 'OTHER');
create type  Status as enum ('PENDING', 'APPROVED', 'DECLINED');


create table Employees(


employee_name text not null,
is_manager Boolean,
pass text not null,
employee_id serial primary key


);



create table Reimbursements(

title text not null,
description text not null,
reimbursement_type refundType not null,
status Status not null,
amount Decimal, 
refund_time time not null,
id serial primary key,
employee_id int references Employees(employee_id)






);



insert into Employees(employee_name, pass, is_manager)
values ('joseph d', 'pass', true ),
        ('john smith','pass', false )    ;  

insert into Reimbursements(title, description, reimbursement_type, status, amount, refund_time, employee_id)
values ('ps4', 'description', 'TRAVEL', 'PENDING', 20.00, now(), 2);


select * from Employees;

select * from Reimbursements;



