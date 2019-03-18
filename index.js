const express = require('express');
const app =express();

app.get('/',(req,res)=> {
    res.send('Hai there !')
});
app.listen(3000,()=>{
    console.log('Listening to port 8080')
});
