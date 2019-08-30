package com.nayank.product.api;

import com.nayank.product.model.ProductItem;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-31T02:55:51.296+05:30")

@Controller
public class ProductApiController implements ProductApi {

    private static final Logger log = LoggerFactory.getLogger(ProductApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Long> addProduct(@ApiParam(value = "Product item to add"  )  @Valid @RequestBody ProductItem productItem) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Long>(objectMapper.readValue("0", Long.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Long>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Long>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteProduct(@ApiParam(value = "Product id to delete",required=true) @PathVariable("productId") UUID productId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductItem> getProductById(@ApiParam(value = "ID of product to return",required=true) @PathVariable("productId") UUID productId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductItem>(objectMapper.readValue("{  \"releaseDate\" : \"2016-08-29T09:12:33.001+0000\",  \"price\" : 1.05,  \"name\" : \"Widget Adapter\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"manufacturer\" : {    \"phone\" : \"408-867-5309\",    \"name\" : \"ACME Corporation\",    \"homePage\" : \"https://www.acme-corp.com\"  }}", ProductItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<ProductItem>(objectMapper.readValue("<null>  <id>d290f1ee-6c54-4b01-90e6-d701748f0851</id>  <name>Widget Adapter</name>  <releaseDate>2016-08-29T09:12:33.001+0000</releaseDate>  <price>1.05</price></null>", ProductItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<ProductItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductItem>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProductItem>> searchProducts(@ApiParam(value = "pass an optional search string for looking up products") @Valid @RequestParam(value = "produceName", required = false) String produceName,@Min(0)@ApiParam(value = "number of records to skip for pagination") @Valid @RequestParam(value = "skip", required = false) Integer skip,@Min(0) @Max(50) @ApiParam(value = "maximum number of records to return") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProductItem>>(objectMapper.readValue("[ {  \"releaseDate\" : \"2016-08-29T09:12:33.001+0000\",  \"price\" : 1.05,  \"name\" : \"Widget Adapter\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"manufacturer\" : {    \"phone\" : \"408-867-5309\",    \"name\" : \"ACME Corporation\",    \"homePage\" : \"https://www.acme-corp.com\"  }}, {  \"releaseDate\" : \"2016-08-29T09:12:33.001+0000\",  \"price\" : 1.05,  \"name\" : \"Widget Adapter\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"manufacturer\" : {    \"phone\" : \"408-867-5309\",    \"name\" : \"ACME Corporation\",    \"homePage\" : \"https://www.acme-corp.com\"  }} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProductItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProductItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductItem> updateProductManufacturer(@ApiParam(value = "ID of product that needs to be updated",required=true) @PathVariable("productId") UUID productId,@ApiParam(value = "Updated Manufacturer of the product"  )  @Valid @RequestBody ProductItem name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductItem>(objectMapper.readValue("{  \"releaseDate\" : \"2016-08-29T09:12:33.001+0000\",  \"price\" : 1.05,  \"name\" : \"Widget Adapter\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"manufacturer\" : {    \"phone\" : \"408-867-5309\",    \"name\" : \"ACME Corporation\",    \"homePage\" : \"https://www.acme-corp.com\"  }}", ProductItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<ProductItem>(objectMapper.readValue("<null>  <id>d290f1ee-6c54-4b01-90e6-d701748f0851</id>  <name>Widget Adapter</name>  <releaseDate>2016-08-29T09:12:33.001+0000</releaseDate>  <price>1.05</price></null>", ProductItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<ProductItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductItem>(HttpStatus.NOT_IMPLEMENTED);
    }

}
