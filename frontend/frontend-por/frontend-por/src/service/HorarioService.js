import axios from 'axios'

export class HorarioService{
    baseUrl="http://localhost:8091/horarios";

     getAll(){
        return axios.get(this.baseUrl +"/all").then(res=> res.data );
      
    }
}