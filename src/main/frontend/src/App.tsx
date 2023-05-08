import React from 'react';
import './App.css';

import {fetchBreedsGetAll} from "./api/Breed";
import {Breed} from "./model/dto/BreedDto";

function App() {
    async function getAllBreeds() {
        for(let i: number = 0; i < 1000; i += 1) {
            const breeds: Breed[] = await fetchBreedsGetAll();
            console.log(breeds)
        }
    }

  return (
    <div className="App">

        <button onClick={getAllBreeds}
            style={{width: "100%", height: "1000px"}}
        >
            Click me
        </button>
    </div>
  );
}

export default App;
