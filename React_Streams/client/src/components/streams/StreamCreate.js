import React from 'react';
//import {Field, reduxForm} from 'redux-form';
import {connect} from 'react-redux';
import {createStream} from '../../actions';
import StreamForm from './StreamForm';

class StreamCreate extends React.Component{
   
    onSubmit=(formValues)=>{
        //console.log(formValues);
        this.props.createStream(formValues);
    }

    render(){
        return (
            <div>
                <h3>Create Stream</h3>
                <StreamForm onSubmit={this.onSubmit}/>
            </div>
        );
    }
}


export default connect(null,{createStream})(StreamCreate);
//validate function is called everytime the form is rerendered.