-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: travel-agency
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `cust_id` int NOT NULL,
  `cust_name` varchar(45) NOT NULL,
  `dob` date NOT NULL,
  `email` varchar(45) NOT NULL,
  `phno` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `dept_id` int NOT NULL,
  `dept_name` varchar(45) NOT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `driver_vehicle`
--

DROP TABLE IF EXISTS `driver_vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driver_vehicle` (
  `driver_id` int NOT NULL,
  `vehicel_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `emp_id` int NOT NULL,
  `emp_name` varchar(45) NOT NULL,
  `dob` date NOT NULL,
  `email` varchar(45) NOT NULL,
  `phno` varchar(10) NOT NULL,
  `address` varchar(45) NOT NULL,
  `salary` double NOT NULL,
  `dept_id` int NOT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `dept_id_idx` (`dept_id`),
  CONSTRAINT `dept_id` FOREIGN KEY (`dept_id`) REFERENCES `department` (`dept_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `route_booking`
--

DROP TABLE IF EXISTS `route_booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `route_booking` (
  `rb_id` int NOT NULL,
  `cust_id_rb` int NOT NULL,
  `employee_id_rb` int NOT NULL,
  `vehicle_id_rb` int NOT NULL,
  `booking_datetime` varchar(45) DEFAULT NULL,
  `noofseats` int NOT NULL,
  `pricing` double NOT NULL,
  `route_id` int NOT NULL,
  PRIMARY KEY (`rb_id`),
  KEY `cust_id_rb_idx` (`cust_id_rb`),
  KEY `employee_id_rb_idx` (`employee_id_rb`),
  KEY `vehicle_id_rb_idx` (`vehicle_id_rb`),
  KEY `route_id_idx` (`route_id`),
  CONSTRAINT `cust_id_rb` FOREIGN KEY (`cust_id_rb`) REFERENCES `customer` (`cust_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `employee_id_rb` FOREIGN KEY (`employee_id_rb`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `route_id` FOREIGN KEY (`route_id`) REFERENCES `route_trip` (`route_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `vehicle_id_rb` FOREIGN KEY (`vehicle_id_rb`) REFERENCES `vehicle` (`vehicle_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `route_trip`
--

DROP TABLE IF EXISTS `route_trip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `route_trip` (
  `route_id` int NOT NULL,
  `route_name` varchar(45) NOT NULL,
  `from` varchar(45) NOT NULL,
  `to` varchar(45) NOT NULL,
  `departure` varchar(45) DEFAULT NULL,
  `arrival` varchar(45) DEFAULT NULL,
  `pricing` double NOT NULL,
  `seat_availability` int NOT NULL,
  `tripplanner_id_route` int NOT NULL,
  PRIMARY KEY (`route_id`),
  KEY `tripplanner_id1_idx` (`tripplanner_id_route`),
  CONSTRAINT `tripplanner_id_route` FOREIGN KEY (`tripplanner_id_route`) REFERENCES `trip_planner` (`tripplanner_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tour_booking`
--

DROP TABLE IF EXISTS `tour_booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tour_booking` (
  `tb_id` int NOT NULL,
  `cust_id_tb` int NOT NULL,
  `tour_id` int NOT NULL,
  `emp_id_tb` int NOT NULL,
  `vehicle_id_tb` int NOT NULL,
  `booking_datetime` varchar(45) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `total_price` double DEFAULT NULL,
  PRIMARY KEY (`tb_id`),
  KEY `cust_id_tb_idx` (`cust_id_tb`),
  KEY `tour_id_idx` (`tour_id`),
  KEY `emp_id_tb_idx` (`emp_id_tb`),
  KEY `vehicle_id_tb_idx` (`vehicle_id_tb`),
  CONSTRAINT `cust_id_tb` FOREIGN KEY (`cust_id_tb`) REFERENCES `customer` (`cust_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `emp_id_tb` FOREIGN KEY (`emp_id_tb`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tour_id` FOREIGN KEY (`tour_id`) REFERENCES `tour_package` (`tour_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `vehicle_id_tb` FOREIGN KEY (`vehicle_id_tb`) REFERENCES `vehicle` (`vehicle_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tour_package`
--

DROP TABLE IF EXISTS `tour_package`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tour_package` (
  `tour_id` int NOT NULL,
  `package_name` varchar(45) NOT NULL,
  `noofdays` int NOT NULL,
  `package_pricing` double NOT NULL,
  `tripplaner_id` int NOT NULL,
  PRIMARY KEY (`tour_id`),
  KEY `tripplanner_id_idx` (`tripplaner_id`),
  CONSTRAINT `tripplanner_id` FOREIGN KEY (`tripplaner_id`) REFERENCES `trip_planner` (`tripplanner_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `trip_planner`
--

DROP TABLE IF EXISTS `trip_planner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trip_planner` (
  `tripplanner_id` int NOT NULL,
  `tripplanner_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`tripplanner_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle` (
  `vehicle_id` int NOT NULL,
  `vehicle_name` varchar(45) NOT NULL,
  `vehicle_nuber` varchar(45) NOT NULL,
  `vehicletype_id` int DEFAULT NULL,
  `seats` int NOT NULL,
  PRIMARY KEY (`vehicle_id`),
  KEY `vehicletype_id_idx` (`vehicletype_id`),
  CONSTRAINT `vehicletype_id` FOREIGN KEY (`vehicletype_id`) REFERENCES `vehicle_type` (`vehicletype_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `vehicle_type`
--

DROP TABLE IF EXISTS `vehicle_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle_type` (
  `vehicletype_id` int NOT NULL,
  `vehicletype_name` varchar(45) NOT NULL,
  PRIMARY KEY (`vehicletype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-19 17:29:02
