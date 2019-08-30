package huby.springframework.msscbeerservice.web.controller;

import huby.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
/**
 * Created by Santiago on 2019-08-30.
 */

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        //TODO: impl

        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        //TODO: impl

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updaetBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
        //TODO: impl

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
