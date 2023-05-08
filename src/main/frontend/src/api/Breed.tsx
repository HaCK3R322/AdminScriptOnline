import {Breed} from "../model/dto/BreedDto";

async function fetchBreedsGetAll(): Promise<Breed[]> {
    const response = await fetch("http://localhost:8080/breed/get/all");
    const breeds: Breed[] = await response.json();
    return breeds;
}



export {fetchBreedsGetAll}