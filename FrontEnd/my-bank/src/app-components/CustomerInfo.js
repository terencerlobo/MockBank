import Container from 'react-bootstrap/Container';
import React, { useEffect, useState } from 'react';
import './components.css';
import NavBar from './NavBar'
import search from './images/search.png';

import CustomerRightPane from './CustomerRightPane';
import {useLocation, useNavigate} from 'react-router-dom';

import Accordion from 'react-bootstrap/Accordion';
import './components.css';
import revenue from './images/bank.png';
import Form from 'react-bootstrap/Form';
import ListGroup from 'react-bootstrap/ListGroup';
import Card from 'react-bootstrap/Card';
import Button from 'react-bootstrap/Button';
import Image from 'react-bootstrap/Image'
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Scheduler from './Scheduler';
import operator from './images/bank.png';
import station from './images/bank.png';

import InputGroup from 'react-bootstrap/InputGroup';

const CustomerInfo = () => {
  const navigate = useNavigate();
  const location = useLocation();
  const [fromDate, setFromDate] = useState("");
  const [toDate, setToDate] = useState("");

  const userName = "Welcome, Punitha";
  const handleFDCallback = (date_str) =>{
    console.log("Here..")
    console.log(date_str)
    if(date_str.search(/From/) != -1){
        setFromDate(date_str)
    }
    else{
        setToDate(date_str)
    }
    
}

  return (
          <div>
              
              <NavBar text = {userName} >
              </NavBar>
                  <div className="justify-content-left" style={{width: '70%'}}>
              <Container>
                  <div> <div class="account-pages my-5 pt-sm-5">
                              <br></br><div className="row align-items-center justify-content-center">
                              

                              <Container>
                              <div> 
                    <div className="account-pages my-5 pt-sm-5">
                        <div className="row align-items-center justify-content-center">
                                <Accordion defaultActiveKey="0">
                                    <Accordion.Item eventKey="0">
                                        <Accordion.Header>Customer/Company Details</Accordion.Header>
                                        <Accordion.Body>
                                        <div className= "center">
                                            <Card style={{ width: '50rem' }}>
                                                <Card.Body>
                                                    <Card.Title>Customer/Company Details</Card.Title>
                                                    <Card.Text>
                                                    <Image alt="" src={revenue}
                                                    width="75"
                                                    height="75"
                                                    className="d-inline-block align-top"/><br></br>
                            
                                                    </Card.Text>
                                                </Card.Body>
                                                <ListGroup className="list-group-flush">
                                                
                                                    <ListGroup.Item> 
                                                    <InputGroup  className="xs-1">
        <Form.Control
          placeholder="CEO Company ID"
          aria-label="CEO Company ID"
          aria-describedby="basic-addon2"
          disabled
          
        />
       <Button variant="outline-none" className="px-1" style={{float:'right', width: '30px' }} 
                            onClick={()=>navigate("/reserve", {state:{userName:location.state.userName}})}>
                              <Image alt="" src={search}
                                                    width="30"
                                                    height="30"
                                                    className="d-inline-block align-top"/>
                            </Button>
                            
      </InputGroup>     
                                                    </ListGroup.Item>
                                                    <ListGroup.Item>
                                                        <div className= "center">
                                                            <Row xs="auto">
                                                                <Col> <Form.Control
          placeholder="Company Name"
          aria-label="Company Name"
          aria-describedby="basic-addon2"
          
          
        /></Col>
                                                                <Col><Form.Control
          placeholder="Tax ID"
          aria-label="Tax ID"
          aria-describedby="basic-addon2"
          
          
        /></Col>
          <Col><Form.Control
          placeholder="RAU"
          aria-label="RAU"
          aria-describedby="basic-addon2"
          
          
        /></Col>
                                                            </Row>
                                                        </div>
                                                    </ListGroup.Item>
                                                
                                                    <ListGroup.Item>
                                                        <div className= "center">
                                                            <Row xs="auto">
                                                            <Col> <Form.Control
          placeholder="Country"
          aria-label="Country"
          aria-describedby="basic-addon2"
          
          
        /></Col>
                                                                <Col><Form.Control
          placeholder="State"
          aria-label="State"
          aria-describedby="basic-addon2"
          
          
        /></Col>
          <Col><Form.Control
          placeholder="ZIP Code"
          aria-label="ZIP Code"
          aria-describedby="basic-addon2"
          
          
        /></Col>
                                                            </Row>
                                                        </div>
                                                    </ListGroup.Item>
                                                </ListGroup>
                                            </Card>
                                            </div>
                                        </Accordion.Body>
                                    </Accordion.Item>
                                    <Accordion.Item eventKey="1">
                                        <Accordion.Header>Customer/Company Users</Accordion.Header>
                                        <Accordion.Body>
                                        <div className= "center">
                                            <Card style={{ width: '50rem' }}>
                                                <Card.Body>
                                                    <Card.Title>Customer/Company Users</Card.Title>
                                                    <Card.Text>
                                                    <Image alt="" src={station}
                                                    width="75"
                                                    height="75"
                                                    className="d-inline-block align-top"/><br></br>
                            
                                                    </Card.Text>
                                                </Card.Body>
                                                <ListGroup className="list-group-flush">
                                                
                                                    <ListGroup.Item> 
                                                   
                                                   <div className = "center">

                                                   <Row xs="auto">
                                                                <Col> 
                                                                <Form.Select size="sm" id="prefix">
                                                            <option value="SS">--Select Prefix--</option>
                                                            <option value="MR">Mr</option>
                                                                <option value="Miss">Miss</option>
                                                                <option value="Mrs">Mrs</option>
                                                                <option value="Mrs">Ms</option>
                                                                <option value="Mrs">Doctor</option>
                                                                <option value="Mrs">Sir</option>
                                                       
                                                        </Form.Select>
                                                                </Col>
                                                                <Col><Form.Control  style={{ width: '250px' }}
          placeholder="Tax ID"
          aria-label="Tax ID"
          aria-describedby="basic-addon2"
          
          
        /></Col>
          <Col><Form.Control  style={{ width: '250px' }}
          placeholder="RAU"
          aria-label="RAU"
          aria-describedby="basic-addon2"
          
          
        /></Col>
                                                            </Row>
                                                    </div>       
                                                    </ListGroup.Item>
                                                    <ListGroup.Item>
                                                        <div className= "center">
                                                            <Row xs="auto">
                                                            <Col> 
                                                                <Form.Select size="sm" id="contacttype">
                                                            <option value="SS">--Select Contact Type--</option>
                                                            <option value="Temperory">Temperory</option>
                                                                <option value="Permenant">Permenant</option>
                                                                
                                                       
                                                        </Form.Select>
                                                                </Col>
                                                                <Col><Form.Check aria-label="option 1" label="Is Admin?" style={{width:'100px'}}/></Col>
                                                                <Col style={{ width: '400px', display: 'flex', alignItems: 'center' }}>
                                                                <label style={{ marginRight: '10px' }}>Active From:</label>
                                                                  <Scheduler id = "swFrom" parentFDCallback = {(date_str) => handleFDCallback(date_str)}/></Col>
                                                            </Row>
                                                        </div>
                                                    </ListGroup.Item>
                                                
                                                    <ListGroup.Item>
                                                        <div className= "center">
                                                            <Row xs="auto">
                                                                <Col><Button variant="outline-secondary" size="sm">Active Station</Button></Col>
                                                                <Col><Button variant="outline-secondary" size="sm">Revenue</Button></Col>
                                                            </Row>
                                                        </div>
                                                    </ListGroup.Item>
                                                </ListGroup>
                                            </Card>
                                            </div>
                                        </Accordion.Body>
                                    </Accordion.Item>
                                    <Accordion.Item eventKey="2">
                                        <Accordion.Header>Operator Report</Accordion.Header>
                                        <Accordion.Body>
                                        <div className= "center">
                                            <Card style={{ width: '50rem' }}>
                                                <Card.Body>
                                                    <Card.Title>Operator Performance</Card.Title>
                                                    <Card.Text>
                                                    <Image alt="" src={operator}
                                                    width="75"
                                                    height="75"
                                                    className="d-inline-block align-top"/><br></br>
                            
                                                    </Card.Text>
                                                </Card.Body>
                                                <ListGroup className="list-group-flush">
                                                
                                                    <ListGroup.Item> 
                                                       
                                                        <Form.Select size="sm" id="operatorSelect">
                                                            <option value="SS">--Select Operator--</option>
                                                           
                                                       
                                                        </Form.Select>
                                                    </ListGroup.Item>
                                                    <ListGroup.Item>
                                                        <div className= "center">
                                                            <Row xs="auto">
                                                                <Col>From: <Scheduler id = "opFrom" parentFDCallback = {(date_str) => handleFDCallback(date_str)}/></Col>
                                                                <Col>To: <Scheduler id = "opTo" parentFDCallback = {(date_str) => handleFDCallback(date_str)}/></Col>
                                                            </Row>
                                                        </div>
                                                    </ListGroup.Item>
                                                
                                                    <ListGroup.Item>
                                                        <div className= "center">
                                                            <Row xs="auto">
                                                                <Col><Button variant="outline-secondary" size="sm" >View Performance</Button></Col>
                                                            </Row>
                                                        </div>
                                                    </ListGroup.Item>
                                                </ListGroup>
                                            </Card>
                                            </div>
                                        </Accordion.Body>
                                    </Accordion.Item>
                                </Accordion>
                        </div>
                    </div>
                </div></Container>
      
    
                              
  </div>

                  </div></div>
              </Container>
              </div>
              <div class="vertical-menu">
              <div className="justify-content-right" style={{width: '20%'}}><br></br>
                  <CustomerRightPane></CustomerRightPane>
               </div>
               </div>
          </div>
      );


}

export default CustomerInfo;