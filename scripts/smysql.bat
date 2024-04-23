::
:: Script Arr^t/Relance conteneur MySql 
::
@echo OFF
set OPTION=%1
if %OPTION%. == start. (
	docker run -d --name mysql --rm -p3307:3306 -e MYSQL_ROOT_PASSWORD="Hitema&2024" -v "C:/Users/bapti/OneDrive/Documents/Hitema/M1 WEB/Java JEE/JavaJEEM1/Data":/var/lib/mysql mysql:8
)else if %OPTION%. == stop. (
	docker stop mysql
) else (
	@echo %0% [start^|stop] 
)