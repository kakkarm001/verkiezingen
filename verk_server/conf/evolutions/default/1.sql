# --- !Ups

-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 19, 2016 at 02:12 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.5.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stemwijzer`
--

-- --------------------------------------------------------

--
-- Table structure for table `answers`
--

CREATE TABLE `answers` (
  `id` int(18) NOT NULL,
  `user_id` int(8) NOT NULL,
  `question_id` int(3) NOT NULL,
  `answer_code_id` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `codes`
--

CREATE TABLE `codes` (
  `id` int(1) NOT NULL,
  `answer_code` int(1) NOT NULL,
  `answer_code_text` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `parties`
--

CREATE TABLE `parties` (
  `id` int(2) NOT NULL,
  `name` varchar(50) NOT NULL,
  `suggestion_text` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `partyanswercodes`
--

CREATE TABLE `partyanswercodes` (
  `id` int(10) NOT NULL,
  `question_id` int(3) NOT NULL,
  `party_id` int(2) NOT NULL,
  `answer_code_id` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `id` int(2) NOT NULL,
  `question` varchar(255) NOT NULL,
  `subject_id` int(2) NOT NULL,
  `party_id` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `results`
--

CREATE TABLE `results` (
  `id` int(10) NOT NULL,
  `user_id` int(8) NOT NULL,
  `party_id` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `id` int(2) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(8) NOT NULL,
  `email` varchar(50) NOT NULL,
  `passw` varchar(16) NOT NULL,
  `age` int(2) NOT NULL,
  `sex` varchar(6) NOT NULL,
  `city` varchar(30) DEFAULT NULL,
  `active` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `answers`
--
ALTER TABLE `answers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_AnsUser` (`user_id`),
  ADD KEY `fk_AnsQuestion` (`question_id`),
  ADD KEY `fk_AnsCode` (`answer_code_id`);

--
-- Indexes for table `codes`
--
ALTER TABLE `codes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `parties`
--
ALTER TABLE `parties`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `partyanswercodes`
--
ALTER TABLE `partyanswercodes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_PacQuestion` (`question_id`),
  ADD KEY `fk_PacParty` (`party_id`),
  ADD KEY `fk_PacCode` (`answer_code_id`);

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_QueSubject` (`subject_id`),
  ADD KEY `fk_QueParty` (`party_id`);

--
-- Indexes for table `results`
--
ALTER TABLE `results`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_ResUser` (`user_id`),
  ADD KEY `fk_ResParty` (`party_id`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `answers`
--
ALTER TABLE `answers`
  MODIFY `id` int(18) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `codes`
--
ALTER TABLE `codes`
  MODIFY `id` int(1) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `parties`
--
ALTER TABLE `parties`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `partyanswercodes`
--
ALTER TABLE `partyanswercodes`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `questions`
--
ALTER TABLE `questions`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `results`
--
ALTER TABLE `results`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `subjects`
--
ALTER TABLE `subjects`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(8) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `answers`
--
ALTER TABLE `answers`
  ADD CONSTRAINT `fk_AnsCode` FOREIGN KEY (`answer_code_id`) REFERENCES `codes` (`id`),
  ADD CONSTRAINT `fk_AnsQuestion` FOREIGN KEY (`question_id`) REFERENCES `questions` (`id`),
  ADD CONSTRAINT `fk_AnsUser` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `partyanswercodes`
--
ALTER TABLE `partyanswercodes`
  ADD CONSTRAINT `fk_PacCode` FOREIGN KEY (`answer_code_id`) REFERENCES `codes` (`id`),
  ADD CONSTRAINT `fk_PacParty` FOREIGN KEY (`party_id`) REFERENCES `parties` (`id`),
  ADD CONSTRAINT `fk_PacQuestion` FOREIGN KEY (`question_id`) REFERENCES `questions` (`id`);

--
-- Constraints for table `questions`
--
ALTER TABLE `questions`
  ADD CONSTRAINT `fk_QueParty` FOREIGN KEY (`party_id`) REFERENCES `parties` (`id`),
  ADD CONSTRAINT `fk_QueSubject` FOREIGN KEY (`subject_id`) REFERENCES `subjects` (`id`);

--
-- Constraints for table `results`
--
ALTER TABLE `results`
  ADD CONSTRAINT `fk_ResParty` FOREIGN KEY (`party_id`) REFERENCES `parties` (`id`),
  ADD CONSTRAINT `fk_ResUser` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

