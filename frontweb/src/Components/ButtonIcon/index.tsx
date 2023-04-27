import './styles.css';

type Props = {
  text: string;
}

const ButtonIcon = ({ text } : Props) => {
  return (
    <div className="btn-container">
      <button className="btn btn-secondary btn-icon-container">
        <h6>{text}</h6>
      </button>
    </div>
  );
};

export default ButtonIcon;
