FROM ubuntu:24.04
WORKDIR /app
COPY app/build/DebPackages/softwarelifecycle_1.0-1_amd64.deb .
RUN apt-get update && apt-get install -y dpkg && dpkg -i ./softwarelifecycle_1.0-1_amd64.deb
CMD ["softwarelifecycle"]
