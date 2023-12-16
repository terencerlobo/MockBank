import React, { useState } from 'react';

function YourComponent() {
  const [input1, setInput1] = useState('');
  const [input2, setInput2] = useState('');

  const handleButtonClick = () => {
    fetch(`http://localhost:8080/getUser`)
      .then(response => response.json())
      .then(data => console.log(data))
      .catch((error) => {
        console.error('Error:', error);
      });
  }

  return (
    <div>
      <input 
        type="text" 
        value={input1} 
        onChange={e => setInput1(e.target.value)} 
        placeholder="Enter first value"
      />

      <input 
        type="text" 
        value={input2} 
        onChange={e => setInput2(e.target.value)} 
        placeholder="Enter second value"
      />

      <button onClick={handleButtonClick}>
        Get User
      </button>
    </div>
  );
}

export default YourComponent;
