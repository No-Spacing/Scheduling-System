-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: facultydata
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `Course_Name` varchar(50) DEFAULT NULL,
  `Course_Year_Section` varchar(30) DEFAULT NULL,
  `Abbreviate` varchar(10) DEFAULT NULL,
  `Year` int(11) DEFAULT NULL,
  `Section` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES ('Bachelor of Science in Information Technology','BSIT 1-1','BSIT',1,1),('Bachelor of Science in Information Technology','BSIT 2-2','BSIT',2,2),('Bachelor of Science in Information Technology','BSIT 3-1','BSIT',3,1),('Bachelor of Science in Information Technology','BSIT 4-1','BSIT',4,1),('Bachelor of Science in Hospitality Management','BSHM 1-1','BSHM',1,1),('Bachelor of Science in Hospitality Management','BSHM 2-1','BSHM',2,1),('Bachelor of Science in Hospitality Management','BSHM 3-1','BSHM',3,1),('Bachelor of Science in Hospitality Management','BSHM 4-1','BSHM',4,1),('Bachelor of Science in Hospitality Management','BSHM 2-2','BSHM',2,2),('Bachelor of Science in Accountancy','BSA 1-1','BSA',1,1),('Bachelor of Science in Accountancy','BSA 2-1','BSA',2,1),('Bachelor of Science in Accountancy','BSA 3-1','BSA',3,1),('Bachelor of Science in Accountancy','BSA 4-1','BSA',4,1),('Bachelor of Science in Information Technology','BSIT 1-2','BSIT',1,2);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-26  9:30:33
