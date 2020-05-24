import _ from 'lodash';
import React from 'react';
import {connect} from 'react-redux'; 
import {fetchStream,editStream} from '../../actions';
import { formValues } from 'redux-form';
import StreamForm from './StreamForm';


//props is being passed by react-router-dom -!!!!!! IMPORTANT -!!!!!!!
class StreamEdit extends React.Component{

    componentDidMount(){
        this.props.fetchStream(this.props.match.params.id);
    }
    onSubmit = (formValues) =>{
        this.props.editStream(this.props.match.params.id,formValues);
    }
    render(){
        if(!this.props.stream){
            return <div>Loading ....</div>;
        }
        //initalvalues is a property of formValues for redux form --!!Important!!
        return (
            <div>
                <h3>Edit Stream</h3>
                <StreamForm onSubmit={this.onSubmit} initialValues={_.pick(this.props.stream,'title','description')}/>
            </div>
        )
    }
}

//ownProps passes props of the component
const mapstatetoprops = (state,ownProps) =>{
    return {stream:state.streams[ownProps.match.params.id]};
}
export default connect(mapstatetoprops,{fetchStream,editStream})(StreamEdit);