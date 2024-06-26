import React, { useEffect, useState } from "react";
// import logo from './logo.svg';
import './App.css';
import Home from './Home';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import GroupList from './components/GroupList';
import GroupEdit from './components/GroupEdit';

function App() {
/*
    const [groups, setGroups] = useState([]);
    const [loading, setLoading] = useState(false);

    useEffect(() => {
        setLoading(true);

        fetch("api/groups")
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then(data => {
                console.log('Fetched data:', data); // Log the fetched data
                if (Array.isArray(data)) {
                    setGroups(data);
                } else {
                    console.error('Fetched data is not an array:', data);
                }
                setLoading(false);
            })
            .catch(error => {
                console.error('Fetching error:', error);
                setLoading(false);
            });
    }, []);

    if (loading) {
        return <p>Loading...</p>
    }*/

    return (
       /* <div className="App">
            <header className="App-header">
                {/!*<img src={logo} className="App-logo" alt="logo" />*!/}
                <div className="App-intro">
                    <h1>Event list</h1>
                    {groups.map(group =>
                        <div key={group.id}>
                            {group.name}
                        </div>
                    )}
                </div>
            </header>
        </div>*/

        <Router>
            <Routes>
                <Route exact path="/" element={<Home/>}/>
                <Route path="/groups" exact={true} element={<GroupList/>}/>
                <Route path="/groups/:id" element={<GroupEdit/>}/>
            </Routes>
        </Router>
    );
}

export default App;
