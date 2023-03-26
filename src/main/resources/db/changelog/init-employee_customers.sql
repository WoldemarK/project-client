create table if not exists employee_customers
(
    employee_company_id int references employee_company(id),
    customers_id int references customers(id),
    constraint  id primary key (employee_company_id,customers_id)

);