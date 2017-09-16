docker container stop springboot
docker container rm springboot
docker run -d -p 8080:8080 -v /home/docker_vdisk/vdisk_springboot_helloworld:/home/springboot --name springboot  springboot
