# Spring-boot-microservices-with-Neo4j
Developing a project which includes multiple microservices with Eureka and Neo4J for data storage.  

How to Start
1. Download 3 microservice different folder
2. Open it on different IDE windows at the same time
3. Make sure the property are sync with your open port. Listed port in application.properties is available on my environment, it might be different on your end
4. Now run the discovery-server and check the port localhost:8761
5. No service should be registered
6. Run Discount-info-service
7. Run Product-info-service
8. Run Product-Catalog-service
9. Check the localhost:8761 all the services should be a register on Eureka dashboard

>Eureka Dashboard after service is register
![Eureka Dashboard after service is register](https://github.com/priyagup/Spring-boot-microservices-with-Neo4j/blob/master/Eureka%20registered%20the%20Instances.PNG)

Neo4J Database Stucture:

-Node 1: Discount_filter with the filed: session and percentage

>Discount_filter
![ Discount_filter](https://github.com/priyagup/Spring-boot-microservices-with-Neo4j/blob/master/Neo4J%20Data/Discount_filter.PNG)

-Node 2: Women_Clothing with the filed: name, type, price 

> Women_Clothing
![ Women_Clothing]( https://github.com/priyagup/Spring-boot-microservices-with-Neo4j/blob/master/Neo4J%20Data/Women_Clothing.PNG)

- Node 3: Women_Shoes with the filed: nam, price

> Women_Shoes
![ Women_Shoes]( https://github.com/priyagup/Spring-boot-microservices-with-Neo4j/blob/master/Neo4J%20Data/Women_Shoes.PNG)

- Node 4: Discounted is the relationship node with one filed which is price and that is calculated after giving the discount as per the discount percentage.

> Discounted
![ Discounted]( https://github.com/priyagup/Spring-boot-microservices-with-Neo4j/blob/master/Neo4J%20Data/Discounted.PNG)


- Relationship between Node 1 and Node 2

> Relationship
![ Relationship]( https://github.com/priyagup/Spring-boot-microservices-with-Neo4j/blob/master/Neo4J%20Data/Relationship.PNG)






