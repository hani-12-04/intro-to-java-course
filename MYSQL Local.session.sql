USE instabook;

-- Drop tables if they exist
DROP TABLE IF EXISTS Comments;
DROP TABLE IF EXISTS Posts;
DROP TABLE IF EXISTS Profiles;

-- Create the profiles table with FirstName and LastName columns
CREATE TABLE Profiles(
   ProfileId    int NOT NULL AUTO_INCREMENT PRIMARY KEY,
   FirstName    varchar(255) NOT NULL,
   LastName     varchar(255) NOT NULL,
   UserHandle   varchar(255) NOT NULL,
   EmailAddress varchar(255) NOT NULL,
   Description  varchar(1000) NULL,
   Picture      varchar(500) NULL
);

-- Create the posts table
CREATE TABLE Posts(
   PostId       bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
   ProfileId    int NOT NULL,
   PostDate     datetime NOT NULL,
   PostPicture  varchar(500) NOT NULL,
   PostCaption  varchar(500) NULL,
   FOREIGN KEY (ProfileId) REFERENCES Profiles(ProfileId)
);

-- Create the comments table
CREATE TABLE Comments(
   CommentId    bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
   PostId       bigint NOT NULL,
   ProfileId    int NOT NULL,
   CommentDate  datetime NOT NULL,
   CommentText  varchar(1000) NULL,
   FOREIGN KEY (PostId) REFERENCES Posts(PostId),
   FOREIGN KEY (ProfileId) REFERENCES Profiles(ProfileId)
);

-- Insert statements with FirstName and LastName split
INSERT INTO Profiles(FirstName, LastName, UserHandle, EmailAddress, Description, Picture) VALUES
('Serena', 'Williams', 'serenawilliams', 'serena@tennis.com', 'I''m Olympia''s mom. @serena ships WORLDWIDE www.serenawilliams.com', 'serena.jpg'),
('Beyoncé', 'Giselle Knowles-Carter', 'beyoncé', 'bey@sashafierce.com', 'tiny.cc/6y3mnz', 'beyonce.png'),
('Jane', 'Doe', 'janedoe', 'janedoe@gmail.com', NULL, NULL);

-- Insert statements for posts
INSERT INTO Posts(ProfileId, PostDate, PostPicture, PostCaption) VALUES
(1, '2019/01/24', 'Instafab.acs73d', 'Best tennis racket ever'),
(1, '2020/02/02', 'Instafab.8iqfa', 'Picture of me on a magazine'),
(2, '2020/04/29', 'Instafab.0d9ass', 'Jay and me with Blue Ivy'),
(2, '2020/03/01', 'Instafab.aoijs', 'Hi bee hive');

-- Insert statements for comments
INSERT INTO Comments(PostId, ProfileId, CommentDate, CommentText) VALUES
(1, 3, '2020/03/11', '😍😍😍!'),
(3, 3, '2020/04/02', '🐝😊🥺😉😍😘😚😜😂😝😳😁😣😢');

-- Select all rows from the profiles table
SELECT * FROM Profiles;