import axios from 'axios'

export class EmpleadoService{
    baseUrl="http://localhost:8090/empleados";

     getAll(){
        return axios.get(this.baseUrl +"/all").then(res=> res.data);
    }
}