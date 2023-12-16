
import Form from 'react-bootstrap/Form';
import { useNavigate  } from 'react-router-dom';
import { Image } from 'react-bootstrap';
import React from 'react';
import logo from './images/bank.png';

import Button from 'react-bootstrap/Button';


const Login = () => {
    const navigate = useNavigate();

    const handleSubmit = () => {
        fetch("http://localhost:8080/authenticateUser",
    {
        method: 'POST',
        headers: {'Content-Type':'application/json','Accept':'application/json'},
        body: JSON.stringify({
            userId: document.getElementById("userId").value,
            pwd: document.getElementById("pwd").value
        }),
       })
    .then(res => res.json())
    .then(
        (data) => {
            console.log(data)
            if(data.message !== "Authentication successful"){
              alert("User name or Password incorrect")
            }
            else{
                navigate("/customerInfo")
            }
        }
    )
    }

    return(
        <div className="my-5 pt-sm-5">
            <div className="container">
                <div className="row align-items-center justify-content-center">
                <div className="col-md-8 col-lg-6 col-xl-5">
                        <div className="card">
                            <div className="card-body p-8">
                            <div className="text-center mt-2">
                                    
                                       
                                        
                                          
                                                <Image alt=""
                                                    src={logo}
                                                    width="100px"
                                                    height="100px"
                                                    className="d-inline-block align-down"/>
                                            
                                            <Form.Group className="mb-3">
                                                <Form.Control type="text" id="userId" placeholder="User Name" />
                                            </Form.Group>
                                            <Form.Group className="mb-3">
                                                <Form.Control type="password" placeholder="Password" id="pwd"/>
                                            </Form.Group>  
                                            <div className="form-check">
                                                <input type="checkbox" className="form-check-input" id="auth-remember-check"/>
                                                <label className="form-check-label" htmlFor="auth-remember-check" style={{float:'left'}}>Remember me</label>
                                            </div>
                                            <div>
                                                <Button variant="link" size = "sm" style={{float:'left'}} >New User? Sign Up</Button>
                                                <Button variant="primary" size = "sm" type="submit" style={{float:'right'}} 
                                                    onClick={() => handleSubmit()}>
                                                    Login
                                                </Button>
                                            </div>
                                        
                                    
                                </div>
                           </div>
                           </div>
                        </div>
                        </div>
                
            </div>
        </div>
    );

}

export default Login;