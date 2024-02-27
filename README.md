# Redis and Spring Boot Integration
   
What is Redis?
- In-memory data structure store
- Key-Value store
- NoSQL database
- High performance and low-latency

Redis Features
- Data Structures (Strings, Lists, Sets, Hashes)
- Pub/Sub messaging
- Persistence options
- Clustering and High Availability

**Redis Integration in Spring Boot**
- Configuration
  
Add Redis dependencies in pom.xml or build.gradle.

Configure Redis connection in application.properties or application.yml.

Spring Data Redis Annotations

@Cacheable, @CachePut, @CacheEvict for caching.

@RedisHash for mapping Java objects to Redis hashes.

