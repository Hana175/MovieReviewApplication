import logo from "./logo.svg";
import "./App.css";
import { useEffect, useState } from "react";
import api from "./api/axiosconfig";

function App() {
  const [movies, setMovies] = useState(); //this will store the movies we get from the api
  const getMovies = async () => {
    try {
      const response = await api.get("/api/v1/movies");
      setMovies(response.data); //this will set the movies state to the data we get from the api

      console.log(response.data);
    } catch (err) {
      console.log(err);
    }
  };
  useEffect(() => {
    getMovies();
  }, []);

  return <div className="App"></div>;
}

export default App;
