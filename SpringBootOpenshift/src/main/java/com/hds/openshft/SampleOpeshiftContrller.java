/**
 * 
 */
package com.hds.openshft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sathiyan
 *
 */
@RestController
@RequestMapping("/openshifService")
public class SampleOpeshiftContrller {
	
	@GetMapping("/ping")
	public String  ping () {
		return "pong!!!";
	}

}
