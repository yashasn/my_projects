import React from 'react';
import SearchBar from './SearchBar';
import youtube from '../api/youtube';
import VideoList from './VideoList';
import VideoDetail from './VideoDetail';
import VideoItem from './VideoItem';

class App extends React.Component{

    state={videos:[],selectedVideo:null};
    componentDidMount(){
        this.onTermSubmit('React tutorials');
    }

    onTermSubmit = async (term)=>{
      const response = await youtube.get('/search',{
            params:{
                part:'snippet',
                type:'video',
                 maxResults: 10,
                key:'',
                q:term
            }
        });
        this.setState({videos:response.data.items, selectedVideo:response.data.items[0]});
        //console.log(response);
    };
    onVideoSelect = (video) => {
        //console.log(video,'selected');
        this.setState({selectedVideo:video});
    }
    
    render(){
        
        return(

            <div className="ui container" style={{marginTop:'50px'}}>
                <SearchBar submit={this.onTermSubmit} ></SearchBar>
                <div className="ui grid">
                    <div className="ui row">
                        <div className="eleven wide column">
                            <VideoDetail video={this.state.selectedVideo}/>
                        </div>
                        <div className="five wide column">
                            <VideoList videos={this.state.videos} onVideoSelect={this.onVideoSelect}></VideoList>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default App;
