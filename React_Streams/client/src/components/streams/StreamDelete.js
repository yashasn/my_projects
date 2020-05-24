import React from 'react';
import Modal from '../Modal';
import {connect} from 'react-redux'; 
import {deleteStream, fetchStream} from '../../actions';
import history from '../../history';


class  StreamDelete extends React.Component{

    componentDidMount(){
        this.props.fetchStream(this.props.match.params.id)
    }
    
    renderActions() {
        return (
        <React.Fragment> 
            <button className="ui button negative" onClick={()=>this.props.deleteStream(this.props.match.params.id)}>Delete</button>
            <button className="ui button" onClick={()=>history.push('/')}>Cancel</button>
        </React.Fragment>
        );}
    renderTitle(){
        if(!this.props.stream)
        {
            return "Delete stream";
        }
        return `Delete ${this.props.stream.title}`;
    }
    render(){
        return (
            <div>
                <Modal title={this.renderTitle()} content="Are you sure you want to delete this stream?" actions={this.renderActions()} onDismiss={()=>history.push('/')}/>
            </div>
        
        );
    }
    
}
const mapstatetoprops = (state,ownProps) =>{
    return {stream:state.streams[ownProps.match.params.id]};
}

export default connect(mapstatetoprops,{deleteStream, fetchStream})(StreamDelete);