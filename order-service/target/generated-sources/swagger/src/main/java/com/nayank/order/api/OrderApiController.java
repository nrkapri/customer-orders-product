package com.nayank.order.api;

import com.nayank.order.model.Address;
import com.nayank.order.model.OrderItem;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-31T03:11:10.158+05:30")

@Controller
public class OrderApiController implements OrderApi {

    private static final Logger log = LoggerFactory.getLogger(OrderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addOrder(@ApiParam(value = "Order to add"  )  @Valid @RequestBody OrderItem orderItem) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteOrder(@ApiParam(value = "Order id to delete",required=true) @PathVariable("orderId") UUID orderId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrderItem> getOrderById(@ApiParam(value = "ID of order to return",required=true) @PathVariable("orderId") UUID orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrderItem>(objectMapper.readValue("{  \"price\" : 10.0,  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"type\" : \"new Phone\",  \"orderdate\" : \"2016-08-29T09:12:33.001+0000\",  \"status\" : \"active\",  \"customer\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"products\" : [ \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"d290f1ee-6c54-4b01-90e6-d701748f0851\" ],  \"shipAddress\" : {    \"zip\" : 61820,    \"country\" : \"USA\",    \"streetName\" : \"Fox Drive\",    \"streetNumber\" : 2019,    \"city\" : \"Champaing\",    \"state\" : \"IL\"  }}", OrderItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrderItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<OrderItem>(objectMapper.readValue("<null>  <id>d290f1ee-6c54-4b01-90e6-d701748f0851</id>  <type>new Phone</type>  <status>aeiou</status>  <customer>d290f1ee-6c54-4b01-90e6-d701748f0851</customer>  <products>d290f1ee-6c54-4b01-90e6-d701748f0851</products>  <orderdate>2016-08-29T09:12:33.001+0000</orderdate>  <price>10.0</price></null>", OrderItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<OrderItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrderItem>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OrderItem>> searchOrder(@ApiParam(value = "pass an optional customerId for looking up the orders") @Valid @RequestParam(value = "customerId", required = false) String customerId,@ApiParam(value = "pass an optional productId for looking up the orders") @Valid @RequestParam(value = "productId", required = false) String productId,@Min(0)@ApiParam(value = "number of records to skip for pagination") @Valid @RequestParam(value = "skip", required = false) Integer skip,@Min(0) @Max(50) @ApiParam(value = "maximum number of records to return") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<OrderItem>>(objectMapper.readValue("[ {  \"price\" : 10.0,  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"type\" : \"new Phone\",  \"orderdate\" : \"2016-08-29T09:12:33.001+0000\",  \"status\" : \"active\",  \"customer\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"products\" : [ \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"d290f1ee-6c54-4b01-90e6-d701748f0851\" ],  \"shipAddress\" : {    \"zip\" : 61820,    \"country\" : \"USA\",    \"streetName\" : \"Fox Drive\",    \"streetNumber\" : 2019,    \"city\" : \"Champaing\",    \"state\" : \"IL\"  }}, {  \"price\" : 10.0,  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"type\" : \"new Phone\",  \"orderdate\" : \"2016-08-29T09:12:33.001+0000\",  \"status\" : \"active\",  \"customer\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"products\" : [ \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"d290f1ee-6c54-4b01-90e6-d701748f0851\" ],  \"shipAddress\" : {    \"zip\" : 61820,    \"country\" : \"USA\",    \"streetName\" : \"Fox Drive\",    \"streetNumber\" : 2019,    \"city\" : \"Champaing\",    \"state\" : \"IL\"  }} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<OrderItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<OrderItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrderItem> updateOrder(@ApiParam(value = "Order object that needs to be updated" ,required=true )  @Valid @RequestBody OrderItem body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrderItem>(objectMapper.readValue("{  \"price\" : 10.0,  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"type\" : \"new Phone\",  \"orderdate\" : \"2016-08-29T09:12:33.001+0000\",  \"status\" : \"active\",  \"customer\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"products\" : [ \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"d290f1ee-6c54-4b01-90e6-d701748f0851\" ],  \"shipAddress\" : {    \"zip\" : 61820,    \"country\" : \"USA\",    \"streetName\" : \"Fox Drive\",    \"streetNumber\" : 2019,    \"city\" : \"Champaing\",    \"state\" : \"IL\"  }}", OrderItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrderItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<OrderItem>(objectMapper.readValue("<null>  <id>d290f1ee-6c54-4b01-90e6-d701748f0851</id>  <type>new Phone</type>  <status>aeiou</status>  <customer>d290f1ee-6c54-4b01-90e6-d701748f0851</customer>  <products>d290f1ee-6c54-4b01-90e6-d701748f0851</products>  <orderdate>2016-08-29T09:12:33.001+0000</orderdate>  <price>10.0</price></null>", OrderItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<OrderItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrderItem>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrderItem> updateOrderShipAddress(@ApiParam(value = "ID of order that needs to be updated",required=true) @PathVariable("orderId") UUID orderId,@ApiParam(value = "Updated Ship Address of the order"  )  @Valid @RequestBody Address name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrderItem>(objectMapper.readValue("{  \"price\" : 10.0,  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"type\" : \"new Phone\",  \"orderdate\" : \"2016-08-29T09:12:33.001+0000\",  \"status\" : \"active\",  \"customer\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"products\" : [ \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"d290f1ee-6c54-4b01-90e6-d701748f0851\" ],  \"shipAddress\" : {    \"zip\" : 61820,    \"country\" : \"USA\",    \"streetName\" : \"Fox Drive\",    \"streetNumber\" : 2019,    \"city\" : \"Champaing\",    \"state\" : \"IL\"  }}", OrderItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrderItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<OrderItem>(objectMapper.readValue("<null>  <id>d290f1ee-6c54-4b01-90e6-d701748f0851</id>  <type>new Phone</type>  <status>aeiou</status>  <customer>d290f1ee-6c54-4b01-90e6-d701748f0851</customer>  <products>d290f1ee-6c54-4b01-90e6-d701748f0851</products>  <orderdate>2016-08-29T09:12:33.001+0000</orderdate>  <price>10.0</price></null>", OrderItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<OrderItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrderItem>(HttpStatus.NOT_IMPLEMENTED);
    }

}
