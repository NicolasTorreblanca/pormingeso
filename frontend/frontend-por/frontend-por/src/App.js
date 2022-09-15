import './App.css';
import React, { Component }  from 'react';
import {HorarioService} from './service/HorarioService';
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
    this.horarioService=new HorarioService();
    
  }

  componentDidMount(){
    this.horarioService.getAll().then(data => this.setState({horarios: data}));
  }


  render(){
    return (
      <div>
      <Panel header = "Tabla Productos">
      <DataTable value={this.state.horarios}>
        <Column field='id' header="id"></Column>
        <Column field='idempleado' header="idempleado"></Column>
        <Column field='horaentrada' header="horaentrada"></Column>
        <Column field='horasalida' header="horasalida"></Column>
        <Column field='horastrabajadas' header=" horastrabajadas"></Column>
        <Column field='fecha' header="fecha"></Column>
      </DataTable>
      </Panel>
      </div>

    )
  }

}
