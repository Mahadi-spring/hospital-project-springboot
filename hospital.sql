-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: hospitaldb
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointment` (
  `id` bigint NOT NULL,
  `last_updated_at` datetime(6) DEFAULT NULL,
  `active` bit(1) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `last_updated_by` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `appointment_date` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `patient_address` varchar(255) DEFAULT NULL,
  `patient_name` varchar(255) DEFAULT NULL,
  `patient_phone` varchar(255) DEFAULT NULL,
  `recommendation` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment`
--

LOCK TABLES `appointment` WRITE;
/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
INSERT INTO `appointment` VALUES (7,'2023-04-15 23:54:50.125249',_binary '','2023-04-15 23:54:50.125249',NULL,NULL,'868','2023-04-02',NULL,NULL,'Male','uyru','wrtwre','86868',NULL,NULL),(8,'2023-04-15 23:55:04.871984',_binary '','2023-04-15 23:55:04.871984',NULL,NULL,'586',NULL,NULL,NULL,'Male','86868','ety','686',NULL,NULL);
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor_signup`
--

DROP TABLE IF EXISTS `doctor_signup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor_signup` (
  `id` bigint NOT NULL,
  `last_updated_at` datetime(6) DEFAULT NULL,
  `active` bit(1) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `last_updated_by` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `specialization_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1oqhk0y8weobee739qg9qik3v` (`specialization_id`),
  CONSTRAINT `FK1oqhk0y8weobee739qg9qik3v` FOREIGN KEY (`specialization_id`) REFERENCES `specialization` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor_signup`
--

LOCK TABLES `doctor_signup` WRITE;
/*!40000 ALTER TABLE `doctor_signup` DISABLE KEYS */;
/*!40000 ALTER TABLE `doctor_signup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (9);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pathology_list`
--

DROP TABLE IF EXISTS `pathology_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pathology_list` (
  `id` int NOT NULL,
  `lab_test_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pathology_list`
--

LOCK TABLES `pathology_list` WRITE;
/*!40000 ALTER TABLE `pathology_list` DISABLE KEYS */;
INSERT INTO `pathology_list` VALUES (1,'X-Ray'),(2,'MRI'),(3,'CT-SCAN'),(4,'CBC');
/*!40000 ALTER TABLE `pathology_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pathology_patient`
--

DROP TABLE IF EXISTS `pathology_patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pathology_patient` (
  `id` bigint NOT NULL,
  `last_updated_at` datetime(6) DEFAULT NULL,
  `active` bit(1) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `last_updated_by` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `lab_test` tinyblob,
  `patient_name` varchar(255) DEFAULT NULL,
  `patient_phone` varchar(255) DEFAULT NULL,
  `reffered_by` varchar(255) DEFAULT NULL,
  `result_date` varchar(255) DEFAULT NULL,
  `test_date` varchar(255) DEFAULT NULL,
  `total` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pathology_patient`
--

LOCK TABLES `pathology_patient` WRITE;
/*!40000 ALTER TABLE `pathology_patient` DISABLE KEYS */;
INSERT INTO `pathology_patient` VALUES (4,'2023-04-15 23:37:22.699633',_binary '','2023-04-15 23:37:22.699633',NULL,NULL,NULL,NULL,NULL,'Test','017412554',NULL,NULL,NULL,NULL),(5,'2023-04-15 23:43:54.521313',_binary '','2023-04-15 23:43:54.521313',NULL,NULL,'63858','Female',NULL,'weqw','8587658','58282','2023-04-27','2023-04-10',8788585),(6,'2023-04-15 23:51:59.046937',_binary '','2023-04-15 23:51:59.046937',NULL,NULL,'5','Male',NULL,'hkig','554','55','2023-04-20','2023-04-10',555);
/*!40000 ALTER TABLE `pathology_patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pathology_patient_pathology_lists`
--

DROP TABLE IF EXISTS `pathology_patient_pathology_lists`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pathology_patient_pathology_lists` (
  `pathology_patient_id` bigint NOT NULL,
  `pathology_lists_id` int NOT NULL,
  KEY `FKk8snnrcrq7uletailim9ff12` (`pathology_lists_id`),
  KEY `FK7gsg7vkxo40w8y8o365kqyjog` (`pathology_patient_id`),
  CONSTRAINT `FK7gsg7vkxo40w8y8o365kqyjog` FOREIGN KEY (`pathology_patient_id`) REFERENCES `pathology_patient` (`id`),
  CONSTRAINT `FKk8snnrcrq7uletailim9ff12` FOREIGN KEY (`pathology_lists_id`) REFERENCES `pathology_list` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pathology_patient_pathology_lists`
--

LOCK TABLES `pathology_patient_pathology_lists` WRITE;
/*!40000 ALTER TABLE `pathology_patient_pathology_lists` DISABLE KEYS */;
INSERT INTO `pathology_patient_pathology_lists` VALUES (4,1),(5,1),(5,2),(5,3),(6,1),(6,2),(6,3),(6,4);
/*!40000 ALTER TABLE `pathology_patient_pathology_lists` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `specialization`
--

DROP TABLE IF EXISTS `specialization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `specialization` (
  `id` int NOT NULL,
  `specialized` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `specialization`
--

LOCK TABLES `specialization` WRITE;
/*!40000 ALTER TABLE `specialization` DISABLE KEYS */;
/*!40000 ALTER TABLE `specialization` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-16  0:09:43
