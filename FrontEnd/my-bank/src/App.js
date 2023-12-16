import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import {
  BrowserRouter as Router,
  Route,
  Routes,
} from "react-router-dom";
import YourComponent from './app-components/YourComponent'
import Login from './app-components/Login'
import CustomerInfo from './app-components/CustomerInfo'

function App() {
  return (
      <Router>
        <Routes>
          <Route exact path='/' element={<Login/>}/>
          <Route exact path='/customerInfo' element={<CustomerInfo/>}/>
          
        </Routes>
      </Router>
  );
}

export default App;
