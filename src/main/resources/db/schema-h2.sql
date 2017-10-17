DROP TABLE IF EXISTS image;
CREATE TABLE image(
	id VARCHAR(32) PRIMARY KEY, 
	name VARCHAR(255),
	thumbnailFilename VARCHAR(255),
	newFilename VARCHAR(255),
	contentType VARCHAR(255),
	fileSize INT,
	thumbnailSize INT,
	dateCreated VARCHAR(255)
	);