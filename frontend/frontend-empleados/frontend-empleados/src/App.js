import './App.css';
import React, { Component }  from 'react';
import {EmpleadoService} from './service/EmpleadoService';
import {DataTable} from 'primereact/datatable';
import { Column } from 'primereact/column';
import { Panel } from 'primereact/panel';
import'primereact/resources/themes/nova-alt/theme.css';
import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';

export default class App extends Component{
  constructor(){
    super();
    this.state={};
    this.empleadoService=new EmpleadoService();
    
  }

  componentDidMount(){
    this.empleadoService.getAll().then(data => this.setState({empleados: data}));
  }


  render(){
    return (
      <div>
      <Panel header = "Tabla Empleados">
      <DataTable value={this.state.empleados}>
        <Column field='id' header="id"></Column>
        <Column field='nombre' header="nombre"></Column>
        <Column field='categoria' header="categoria"></Column>
      </DataTable>
      </Panel>
      </div>

    )
  }
}