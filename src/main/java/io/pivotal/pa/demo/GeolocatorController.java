package io.pivotal.pa.demo;

import io.pivotal.pa.demo.geolocator.wsdl.GetGeoIPResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by crdant on 4/12/17.
 */

@RestController
public class GeolocatorController {
    @RequestMapping("/address/{ip}/location")
    public GetGeoIPResponse getLocation (@PathVariable("ip") String ip ) {
        // call the SOAP service instead of just creating an empty object
        GetGeoIPResponse response = new GetGeoIPResponse();
        return response ;
    }

}
