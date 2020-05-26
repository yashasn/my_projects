import axios from 'axios';

//const KEY = 'AIzaSyALpiUsMLZDw8JsJiu2X6X6NNxrpY8bQZk';
export default axios.create({
    baseURL:'https://www.googleapis.com/youtube/v3'
});