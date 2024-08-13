create table if not exists open_shift_architecture_components(
atomic_service varchar(255) not null,
docker_service varchar(255) null,
open_vs_withservice varchar(255) null,
crio_service varchar(255) null,
master_api char null,
master_api_service varchar(255) null,
master_controller char null,
master_controller_service varchar(255) null,
etcd_service varchar(255) null,
systemd_services varchar(255) null,
components_list varchar(255) null,
constraint open_shift_architecture_components_pk primary key(atomic_service));