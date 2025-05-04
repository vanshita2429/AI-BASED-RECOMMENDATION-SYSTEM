# AI-BASED-RECOMMENDATION-SYSTEM

*COMPANY*: CODETECH IT SOLUTIONS

*NAME*: VANSHITA RATHOD

*INTERN ID*: CT06DA295

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 6 WEEKS

*MENTOR*: NEELA SANTOSH

# **Building a Recommendation System Using Java and Apache Mahout**

As part of my Java learning journey, I developed a simple recommendation system using Java and a powerful open-source machine learning library called Apache Mahout. The goal of this project was to create a program that could suggest products or content to users based on their preferences. This type of system is commonly used in real-world platforms like Amazon, Netflix, and Spotify where recommendations play a huge role in personalizing the user experience.

To start, I used basic Java programming and integrated Apache Mahout through Maven, which helped manage the dependencies easily. I wrote my code in a simple text editor and used the command line to compile and run the project. The dataset I used was a CSV file named preferences.csv, which included dummy data in the format of user IDs, item IDs, and the corresponding preference scores (ratings). This file acted as the source of user behavior, which Mahout used to understand similarities and generate recommendations.

In the code, I first loaded the dataset using Mahout's FileDataModel class. Then, I calculated user similarities using the PearsonCorrelationSimilarity class. This method measures how similar two users are based on the items they have rated. After that, I created a neighborhood of users using NearestNUserNeighborhood, which helps the system find the most similar users for making predictions. Finally, I used GenericUserBasedRecommender to generate and display recommendations for a particular user.

One of the most interesting parts of this project was seeing how even with a small dataset, the system could identify patterns and suggest items that the target user hadn’t interacted with but might like. I also added error handling to make sure the program runs smoothly even if there are issues with the input file or data.

This recommendation system can be used in many real-world scenarios. For example, in an e-commerce application, it can suggest products to customers. In a movie or music app, it can recommend new titles based on what users with similar tastes have liked. Even in education platforms, it can suggest courses or resources. The underlying technique of collaborative filtering, which Mahout uses, is widely used in industry and this project gave me a basic but solid understanding of how it works.

The entire project was done on a basic Java development setup using Notepad for editing and Maven for building and running the application. This experience helped me get comfortable with command-line tools and understand how external libraries can be added and used in a Java project.

In conclusion, this recommendation system project taught me how to work with Java libraries, handle file input/output, and understand the basics of collaborative filtering. Apache Mahout made it easy to implement advanced logic without writing complex algorithms from scratch. Overall, it was a great learning experience and showed me how powerful even a simple Java application can be when integrated with machine learning tools.

#OUTPUT

![Image](https://github.com/user-attachments/assets/ba130e7b-d0cf-42d4-a32a-90e8aa0acf94)
