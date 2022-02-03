

create table Employees(


employee_name text not null,
is_manager Boolean,
employee_id serial primary key


);



create table Reimbursements(

title text not null,
description text not null,
reimbursement_type text not null,
status text not null,
amount Decimal, 
refund_time time not null,
id serial primary key,
employee_id int references Employees(employee_id)




);

insert into Employees(employee_name, is_manager, employee_id)
values ('joseph d', true ),
        ('john smith',false )    ;  

insert into Reimbursements(title, description, reimbursement_type, status, amount, time, employee_id)
values (title, description, reimbursement_type, status, amount, time, employee_id);


select * from Employees;

select * from Reimbursements;



