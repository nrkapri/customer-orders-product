package com.nayank.customer.api;

import com.nayank.customer.model.Address;
import com.nayank.customer.model.Customer;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-31T02:55:30.163+05:30")

@Controller
public class CustomerApiController implements CustomerApi {

    private static final Logger log = LoggerFactory.getLogger(CustomerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Long> addCustomer(@ApiParam(value = "Customer object that needs to be added to the store" ,required=true )  @Valid @RequestBody Customer body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Long>(objectMapper.readValue("0", Long.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Long>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Long>(objectMapper.readValue("123456789", Long.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Long>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Long>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCustomer(@ApiParam(value = "Customer id to delete",required=true) @PathVariable("customerId") Long customerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Customer>> findCustomersByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "active, suspended, cancelled") @Valid @RequestParam(value = "status", required = true) List<String> status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Customer>>(objectMapper.readValue("[ {  \"address\" : {    \"zip\" : 61820,    \"country\" : \"USA\",    \"streetName\" : \"Fox Drive\",    \"streetNumber\" : 2019,    \"city\" : \"Champaing\",    \"state\" : \"IL\"  },  \"name\" : \"Nayan\",  \"id\" : 0,  \"status\" : \"active\"}, {  \"address\" : {    \"zip\" : 61820,    \"country\" : \"USA\",    \"streetName\" : \"Fox Drive\",    \"streetNumber\" : 2019,    \"city\" : \"Champaing\",    \"state\" : \"IL\"  },  \"name\" : \"Nayan\",  \"id\" : 0,  \"status\" : \"active\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Customer>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<Customer>>(objectMapper.readValue("<Customer>  <id>123456789</id>  <name>Nayan</name>  <status>aeiou</status></Customer>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Customer>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Customer>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Customer> getCustomerById(@ApiParam(value = "ID of customer to return",required=true) @PathVariable("customerId") Long customerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("{  \"address\" : {    \"zip\" : 61820,    \"country\" : \"USA\",    \"streetName\" : \"Fox Drive\",    \"streetNumber\" : 2019,    \"city\" : \"Champaing\",    \"state\" : \"IL\"  },  \"name\" : \"Nayan\",  \"id\" : 0,  \"status\" : \"active\"}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("<Customer>  <id>123456789</id>  <name>Nayan</name>  <status>aeiou</status></Customer>", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Customer> updateCustomer(@ApiParam(value = "Customer object that needs to be updated" ,required=true )  @Valid @RequestBody Customer body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("{  \"address\" : {    \"zip\" : 61820,    \"country\" : \"USA\",    \"streetName\" : \"Fox Drive\",    \"streetNumber\" : 2019,    \"city\" : \"Champaing\",    \"state\" : \"IL\"  },  \"name\" : \"Nayan\",  \"id\" : 0,  \"status\" : \"active\"}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("<Customer>  <id>123456789</id>  <name>Nayan</name>  <status>aeiou</status></Customer>", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Customer> updateCustomerAddress(@ApiParam(value = "ID of customer that needs to be updated",required=true) @PathVariable("customerId") Long customerId,@ApiParam(value = "Updated customer Address"  )  @Valid @RequestBody Address customerAddress) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("{  \"address\" : {    \"zip\" : 61820,    \"country\" : \"USA\",    \"streetName\" : \"Fox Drive\",    \"streetNumber\" : 2019,    \"city\" : \"Champaing\",    \"state\" : \"IL\"  },  \"name\" : \"Nayan\",  \"id\" : 0,  \"status\" : \"active\"}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("<Customer>  <id>123456789</id>  <name>Nayan</name>  <status>aeiou</status></Customer>", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }

}
