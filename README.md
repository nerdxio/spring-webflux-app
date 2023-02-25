# spring-webflux-app
Simple REST Service using Spring boot ,Spring WebFlux and Spring Data Reactive MongoDB

### Built With

* [Spring boot](https://spring.io/projects/spring-boot)
* [Spring WebFlux](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html)
* [Spring Data Reactive MongoDB](https://www.mongodb.com/cloud/atlas/lp/try4?utm_content=controlhterms&utm_source=google&utm_campaign=search_gs_pl_evergreen_atlas_core_prosp-brand_gic-null_emea-eg_ps-all_desktop_eng_lead&utm_term=mongodb&utm_medium=cpc_paid_search&utm_ad=e&utm_ad_campaign_id=12212624392&adgroup=115749716783&cq_cmp=12212624392&gclid=Cj0KCQiAgOefBhDgARIsAMhqXA44bgRsPcILbEn9GdNd2Z2epp4t2xT21-UzzlW6L3ihl1Zl7cSWun8aAgnaEALw_wcB)
* [Lombok](https://projectlombok.org/)

### Installation

2. Clone the repo
   ```sh
   git clone https://github.com/hassanrefaat9/spring-webflux-app.git
   ```
3. Add Maven Dependency
   ```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-webflux</artifactId>
        </dependency>
   
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-mongodb-reactive</artifactId>
            <version>3.0.3</version>
        </dependency>
   
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
   ```
4. Enter your App Config in `application.properties`
   ```properties
   #mongodb
   spring.data.mongodb.host=localhost
   spring.data.mongodb.port=27017
   spring.data.mongodb.database=product
   #loggin
   logging.level.org.springframework.data=debug
   ```

### End Point


| Method   | URL                                | Description                 |
|----------|------------------------------------|-----------------------------|
| `GET`    | `htttps:/localhost/product/`       | Retrieve all products.      |
| `GET`    | `htttps:/localhost/product/{id}`   | Retrieve a product by ID.   |
| `GET`    | `htttps:/localhost/product/{name}` | Retrieve a product by name. |
| `POST`   | `htttps:/localhost/product/`       | Insert new product.         |
| `PUT`    | `htttps:/localhost/product/`       | Update an existing product. |
| `DELETE` | `htttps:/localhost/product/{id}`   | Delete a product using ID.  |
